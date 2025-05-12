package org.example.Clases;


public class Factura {
    private int id;
    private String servicio;
    private double total;
    private String fecha;

    public Factura(int id, String fecha, String servicio, double total) {
        this.id = id;
        this.fecha = fecha;
        this.servicio = servicio;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) { this.total = total; }
}


