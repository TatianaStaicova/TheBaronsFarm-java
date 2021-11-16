package hbcu.stay.ready.baronsfarm;

import java.util.List;

public class Field {
    private List<CropRow> cropRows;

    public Field(){

    }
    public Field (List<CropRow> cropRows){
        this.cropRows = cropRows;
    }
    public List<CropRow> getCropRows(){
        return cropRows;
    }
    public void setCropRows(List<CropRow> cropRows){
        this.cropRows = cropRows;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cropRows=" + cropRows +
                '}';
    }
}
