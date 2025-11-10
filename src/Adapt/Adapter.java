package Adapt;
    public class Adapter implements Animal{
        public Adaptee adaptee;
        public Adapter(Adaptee adaptee){
            this.adaptee = adaptee;
        }

        @Override
        public String getInfo(){
            try{
                return adaptee.callRoar();
            }
            catch(Exception e){
                return null;
            }
        }
    }
