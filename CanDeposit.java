package com.pbo4;

public interface CanDeposit {
    public Integer cekSaldo();
    public void deposit(Integer jumlahDeposit);
    public void tarikTunai(Integer jumlahTarikTunai);
}
