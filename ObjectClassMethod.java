class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    

    // public String toString() {
    //     return model + " : " + price;
    // }

    
}

public class ObjectClassMethod {
    public static void main(String[] args) {
        
        Laptop obj = new Laptop();
        obj.model = "Dell";
        obj.price = 200000;

        System.out.println(obj);
        System.out.println(obj.toString());  // this .toString() is hidden by default which works same as the above line
                                            // it generates the hashcode for the object

    }
}