import java.util.List;

public class Item {


    private List<Item> items;
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
        public String nombre;
        public double precio;

        
        public Item(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }


        public String getNombre() {
            return nombre;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public double getPrecio() {
            return precio;
        }


        public void setPrecio(double precio) {
            this.precio = precio;
        }
}

