package com.pbo4;

public class MemberReguler extends Member {

    @Override
    public Integer hitungTotalBayar(Integer totalBayar) {
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar = totalBayar - totalBayar * 1/100;
            this.totalBayar = totalBayar;
        }
        if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar = totalBayar - totalBayar * 2/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 7000000){
            totalBayar =  totalBayar - totalBayar * 3/100;
            this.totalBayar = totalBayar;
        }
        
        this.totalBayar = totalBayar;
        return this.totalBayar;
    }

    @Override
    public String toString() {
        return "MemberReguler []";
    }

    @Override
    public Integer getPoin() {
        // TODO Auto-generated method stub
        return super.getPoin();
    }

    @Override
    public void redeemPoin(Integer hargaSouvenir) {
        // TODO Auto-generated method stub
        super.redeemPoin(hargaSouvenir);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    protected Integer getBonusPoin(Integer totalBayar) {
        // TODO Auto-generated method stub
        return super.getBonusPoin(totalBayar);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    void display(){
        System.out.println("Total =  " + totalBayar);
    }
}