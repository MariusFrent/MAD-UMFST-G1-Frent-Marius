public class Masina_E 
{
    private String marca;
    private int rulaj_km;

    public String getMarca()
    {
        return marca;
    }

    public int getRulaj_km()
    {
        return rulaj_km;
    }

    public void setMarca(String marca)
    {
        this.marca=marca;
    }

    public void setRulaj_km(int rulaj_km)
    {
        this.rulaj_km=rulaj_km;
    }

    public static void main(String[] args) 
    {
        Masina_E m = new Masina_E();
        m.setMarca("Audi");
        m.setRulaj_km(180000);
        System.out.println("Marca masinii: "+m.getMarca());
        System.out.println("Rulaj: "+m.getRulaj_km());
    } 
}