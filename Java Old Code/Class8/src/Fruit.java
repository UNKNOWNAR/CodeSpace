class Fruit
{
   String size;
   String colour;
   int seed;
   Fruit(String SIZE, String COLOUR ,int SEED )
   {
       size = SIZE ;
       colour = COLOUR ;
       seed = SEED;
    }
    void showFruit()
    {
        System.out.println("SIZE\tCOLOUR\tSEED");
         System.out.println(size + "\t" + colour + "\t"+ seed);
        }
    }
   

