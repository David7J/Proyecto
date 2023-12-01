public class Factura {
    
    private String recibo;
    private String servicio;
    private String cajero;
    private String NuTRX;
    private String factura;
    private double monto;
    private String cedula;
    private String moneda;
    private double efectivo;
    private double total;

    public Factura(){
    
    }

    public Factura(String recibo, String servicio, String cajero, String NuTRX, String factura, double monto, String cedula, String moneda, double efectivo, double total){
        this.recibo = recibo;
        this.servicio = servicio;
        this.cajero = cajero;
        this.NuTRX = NuTRX;
        this.factura = factura;
        this.monto = monto;
        this.cedula = cedula;
        this.moneda = moneda;
        this.efectivo = efectivo;
        this.total = total;
        }

    public String mostrarRecibo() {
        return recibo;
    }

    public String mostrarServicio() {
        return servicio;
    }

    public String mostrarCajero() {
        return cajero;
    }

    public String mostrarNuTRX() {
        return NuTRX;
    }

    public String mostrarFactura() {
        return factura;
    }

    public double mostrarMonto() {
        return monto;
    }

    public String mostrarCedula() {
        return cedula;
    }

    public String mostrarMoneda() {
        return moneda;
    }

    public double mostrarEfectivo() {
        return efectivo;
    }

    public double mostrarTotal() {
        return total;
    }




    public void establecerRecibo(String recibo) {
        this.recibo = recibo;
    }

    public void establecerServicio(String servicio) {
        this.servicio = servicio;
    }

    public void establecerCajero(String cajero) {
        this.cajero = cajero;
    }

    public void establecerNuTRX(String NuTRX) {
        this.NuTRX = NuTRX;
    }

    public void establecerFactura(String factura) {
        this.factura = factura;
    }

    public void establecerMonto(double monto) {
        this.monto = monto;
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void establecerEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public void establecerTotal(double total) {
        this.total = total;
    }

}