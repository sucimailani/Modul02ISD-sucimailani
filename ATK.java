public class ATK {

    public String kodebarang;
    public String jenisBarang;
    public String namabarang;
    public int stok;
    
    public ATK(String kodebarang, String jenisBarang, String namabarang, int stok) {
        this.kodebarang = kodebarang;
        this.jenisBarang = jenisBarang;
        this.namabarang = namabarang;
        this.stok = stok;
    }
    public String getKodebarang() {
        return kodebarang;
    }
    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamabarang() {
        return namabarang;
    }
    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    @Override
    public String toString() {
        return "ATK [kodebarang=" + kodebarang + ", jenisBarang=" + jenisBarang + ", namabarang=" + namabarang
                + ", stok=" + stok + "]";
    }

}