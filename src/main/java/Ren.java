

import java.util.Vector;

public class Ren {
    private String shifa;
    private String daoda;
    private int number;
    private String jicang;
    private String chengkezhonglei;
    Vector<Xingli> xingli=new Vector<Xingli>();
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDaoda() {
        return daoda;
    }
    public void setDaoda(String daoda) {
        this.daoda = daoda;
    }
    public String getShifa() {
        return shifa;
    }
    public void setShifa(String shifa) {
        this.shifa = shifa;
    }
    public void Setxingli(int zhongliang,int chang,int kuan,int gao) {
        Xingli xl=new Xingli();
        xl.setChang(chang);
        xl.setGao(gao);
        xl.setKuan(kuan);
        xl.setZhongliang(zhongliang);
        xingli.add(xl);
    }
    public String getJicang() {
        return jicang;
    }
    public void setJicang(String jicang) {
        this.jicang = jicang;
    }
    public String getChengkezhonglei() {
        return chengkezhonglei;
    }
    public void setChengkezhonglei(String chengkezhonglei) {
        this.chengkezhonglei = chengkezhonglei;
    }
    public void clearxingli() {
        xingli.clear();
    }
}
