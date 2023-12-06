public class Widget {

    private int inStock ;

    public Widget () {

        inStock = 10 ;

    }

    public void addInventory ( int amt ) {

        inStock = inStock + amt ;

    }

    public static void main ( String [] args ){

        Widget blueWidget = new Widget ();

        Widget greenWidget = new Widget ();

        blueWidget . addInventory ( 15 );

        greenWidget . addInventory ( 5 );

        System.out.println("blueWidget's inStock: " + blueWidget.inStock);
        Integer cost = 15 ;

        int quantity = 20 ;

    }

}
