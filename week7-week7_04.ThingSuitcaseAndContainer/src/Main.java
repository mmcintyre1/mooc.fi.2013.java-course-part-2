
public class Main {

    public static void main(String[] Container) {

        Container container = new Container(128);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(new Thing("Porsas", 7));
        suitcase.addThing(new Thing("Siili", 2));
        
        container.addSuitcase(suitcase);

        suitcase = new Suitcase(10);
        suitcase.addThing(new Thing("Kana", 5));
        suitcase.addThing(new Thing("Kettu", 3));

        container.addSuitcase(suitcase);

        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addThing(new Thing("Silli", 5));
        suitcase2.addThing(new Thing("Siika", 3));
        
        container.addSuitcase(suitcase2);
        container.printThings();
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        int brickWeight = 1;

        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", brickWeight);
            Suitcase brickCase = new Suitcase(100);

            brickCase.addThing(brick);
            container.addSuitcase(brickCase);

            if (brickWeight <= 100) {
                brickWeight++;
            }
        }
    }
}
