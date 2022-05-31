
package Model;

import java.util.Date;

public class Producto {
       private int id_producto;
    private String nom_producto;
    private int categoria_id;
    private String des_producto;
    private float stock;
    private float precio;
    private String unidadMedida;
    private int estado;
    private Categoria categoria; 
    private Date fecha_entrada;

    public Producto() {
        this.id_producto = 0;
        this.categoria = new Categoria();
    }

    public Producto(int id_producto, String nom_producto, int categoria_id, String des_producto,  float stock, float precio, String unidadMedida, int estado, Date fecha_entrada,  Categoria categoria) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.categoria_id = categoria_id;
        this.des_producto = des_producto;
        this.stock = stock;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.estado = estado;
        this.fecha_entrada = fecha_entrada;
        this.categoria = categoria;
        
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
        
    }

    public String getDes_producto() {
        return des_producto;
    }

    public void setDes_producto(String des_producto) {
        this.des_producto = des_producto;
    }
    
    

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    
    

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
