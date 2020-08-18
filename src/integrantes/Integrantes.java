
package integrantes;


public class Integrantes {
    public class producto{
        private int idproducto;
        private String codigo;
        private String nombre;
        private float precio;
        private int stock;
        private String estado;
        
        public producto(){    
        }

        public producto(int idproducto, String codigo, String nombre, float precio, int stock, String estado) {
            this.idproducto = idproducto;
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
            this.estado = estado;
        }

        public int getIdproducto() {
            return idproducto;
        }

        public void setIdproducto(int idproducto) {
            this.idproducto = idproducto;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }      
    }
    public class proveedor{
        private int idproveedor;
        private String nombre;
        private String ruc;
        private String direccion;    
        private String estado;
        
        public proveedor(){
        }

            public proveedor(int idproveedor, String nombre, String ruc, String direccion, String estado) {
                this.idproveedor = idproveedor;
                this.nombre = nombre;
                this.ruc = ruc;
                this.direccion = direccion;
                this.estado = estado;
            }

            public int getIdproveedor() {
                return idproveedor;
            }

            public void setIdproveedor(int idproveedor) {
                this.idproveedor = idproveedor;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getRuc() {
                return ruc;
            }

            public void setRuc(String ruc) {
                this.ruc = ruc;
            }

            public String getDireccion() {
                return direccion;
            }

            public void setDireccion(String direccion) {
                this.direccion = direccion;
            }

            public String getEstado() {
                return estado;
            }

            public void setEstado(String estado) {
                this.estado = estado;
            }
        
        }    
    
}
