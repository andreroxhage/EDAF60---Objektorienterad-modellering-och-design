package xl.expr;

import java.util.TreeMap;
import java.util.Map;
import java.util.Observable;
import xl.util.XLException;

@SuppressWarnings("deprecation")
public class Sheet extends Observable implements Environment{

    private Map<String, Cell> sheet;
    private Status status;


    public Sheet(){
        sheet = new TreeMap<String,Cell>();
        this.status = new Status();
    }

    public void addCell(String address, String expr){
        Cell oldCell = sheet.get(address);
        if (parserExpr(expr)){
            Cell newCell = CellFactory.makeCell(expr);
            if(!bombExplode(address, newCell))
                try{
                sheet.put(address, newCell);
                } catch(NullPointerException e){
                    status.setStatus(XLException.emptyCellError().toString());
                    sheet.put(address, oldCell);
                }
                setChanged();
                notifyObservers();
            }
        else {
            sheet.put(address, oldCell);
        }
    }

    public boolean parserExpr(String string){
        try {
            Cell newCell = CellFactory.makeCell(string);
        } catch (XLException e) {
            status.setStatus(e.toString());
            setChanged();
            notifyObservers();
            return false;
        }
        return true;
    }

    public Status getStatus(){
        return status;
    }

    public void load(Map<String, String> map){
        this.clearAll();
        for (Map.Entry <String, String> entry : map.entrySet()){
            try {
            sheet.put(entry.getKey(), CellFactory.makeCell(entry.getValue()));
            } catch (Exception e){
                status.setStatus(e.getMessage());
                setChanged();
                notifyObservers();
                throw new IllegalArgumentException();
            }
            status.clearStatus();
        }
        setChanged();
        notifyObservers();
    }

    public void clearAll(){
        for (Map.Entry<String,Cell> entry : sheet.entrySet()){
            clearCell(entry.getKey());
        }
        setChanged();
        notifyObservers();
    }

    public Map<String, Cell> getCells(){
        return sheet;
    }

    public Cell getCell(String address){
        return sheet.get(address);
    }

    public void clearCell(String address){
        sheet.remove(address);
        setChanged();
        notifyObservers();
    }

    public boolean bombExplode(String address, Cell cell){
        Cell temp = sheet.get(address);
        BombCell bomb = new BombCell();
        sheet.put(address, bomb);
        try {
            cell.value(this);
        } catch (XLException e) {
            status.setStatus(e.toString());
            sheet.put(address, temp);
            return true;
        } catch (NullPointerException e) {
            status.setStatus(XLException.emptyCellError().toString());
            sheet.put(address, temp);
            return true;
        } 
        sheet.put(address, temp);
        return false;
    }

    @Override
    public double value(String address) {
        try {
        return sheet.get(address).value(this);
        } catch (XLException e) {
        if (e.toString().equalsIgnoreCase(XLException.divByZeroError().toString())) {
            status.setStatus(e.getMessage());
            setChanged();
            notifyObservers();
        }
        throw e;
        }
    }
}