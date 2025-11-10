public class Task {
        interface Developer{
                void develop();
        }
        class JavaDeveloper implements Developer{
                @Override
                public void develop() {
                        System.out.println("Java Developer");
                }
        }
        class PythonDeveloper implements Developer{
                @Override
                public void develop() {
                        System.out.println("Python Developer");
                }
        }
        class Decorator implements Developer{
                private Developer developer;
                public Decorator(Developer developer){
                        this.developer=developer;
                }
                @Override
                public void develop() {
                        developer.develop();
                }
        }
        class SenyorDeveloper extends Decorator{
                public SenyorDeveloper(Developer developer){
                        super(developer);
                }
                public void developer(){
                        System.out.println("Senyor Developer");
                        super.develop();
                }
        }

}
