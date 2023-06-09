
public class Calisan {

    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void giris() {
        System.out.println(this.adSoyad + "   giriş yaptı");
    }

    public void cikis() {
        System.out.println(this.adSoyad + " çıkış yaptı ");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " yemekhaneye girdi");
    }

}
