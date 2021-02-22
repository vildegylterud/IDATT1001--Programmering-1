public class Arrangement {

    private int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt;

    public Arrangement(int nummer,String navn, String sted, String arrangor, String type, long tidspunkt) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangor = arrangor;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    //Get-metoder

   // public int getNummer() { return nummer; } (Ikke i bruk)

  //  public String getNavn() { return navn; } (Ikke i bruk)

    public String getSted() { return sted; }

//    public String getArrangor() { return arrangor; }

    public String getType() { return type; }

    public long getTidspunkt() { return tidspunkt; }

    //Set-metoder (Ikke i bruk)
/**
    public void setNummer(int nummer) { this.nummer = nummer; }

    public void setNavn(String navn) { this.navn = navn; }

    public void setSted(String sted) { this.sted = sted; }

    public void setArrangor(String arrangor) { this.arrangor = arrangor; }

    public void setType(String type) { this.type = type; }

    public void setTidspunkt(long tidspunkt) { this.tidspunkt = tidspunkt; }

 **/

    @Override
    public String toString() {
        return "Arrangement{" +
                "nummer=" + nummer +
                ", navn='" + navn + '\'' +
                ", sted='" + sted + '\'' +
                ", arrangor='" + arrangor + '\'' +
                ", type='" + type + '\'' +
                ", tidspunkt=" + tidspunkt +
                '}';
    }
}








