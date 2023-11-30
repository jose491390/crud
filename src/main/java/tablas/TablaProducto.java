package tablas;




public class TablaProducto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int precioUnidadCompra;
    private int iva;
    private int precioUnidadVenta;

    public TablaProducto() {
    }

    public TablaProducto(int id, String nombre, String descripcion, int precioUnidadCompra, int iva, int precioUnidadVenta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnidadCompra = precioUnidadCompra;
        this.iva = iva;
        this.precioUnidadVenta = precioUnidadVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnidadCompra() {
        return precioUnidadCompra;
    }

    public void setPrecioUnidadCompra(int precioUnidadCompra) {
        this.precioUnidadCompra = precioUnidadCompra;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getPrecioUnidadVenta() {
        return precioUnidadVenta;
    }

    public void setPrecioUnidadVenta(int precioUnidadVenta) {
        this.precioUnidadVenta = precioUnidadVenta;
    }
    
    
    
    
}
