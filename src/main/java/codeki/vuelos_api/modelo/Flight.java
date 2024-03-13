package codeki.vuelos_api.modelo;

public class Flight {

    private Long id;
    private String origen;
    private String destino;
    private String fechaHoraSalida;
    private String fechaHoraLlgada;
    private Double precio;
    private String frecuencia;

    //constructor vacio
    public Flight() {
    }

    //constructor con atributos

    public Flight(Long id, String origen, String destino, String fechaHoraSalida, String fechaHoraLlgada, Double precioEnPesos, String frecuncia) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlgada = fechaHoraLlgada;
        this.precio = precioEnPesos;
        this.frecuencia = frecuncia;
    }


    //get n set


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(String fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getFechaHoraLlgada() {
        return fechaHoraLlgada;
    }

    public void setFechaHoraLlgada(String fechaHoraLlgada) {
        this.fechaHoraLlgada = fechaHoraLlgada;
    }

    public Double getPrecioEnPesos() {
        return precio;
    }

    public void setPrecioEnPesos(Double precioEnPesos) {
        this.precio = precioEnPesos;
    }

    public String getFrecuncia() {
        return frecuencia;
    }

    public void setFrecuncia(String frecuncia) {
        this.frecuencia = frecuncia;
    }
}
