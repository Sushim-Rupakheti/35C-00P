public class InterfaceClass{
    public static void main(String[] args){

    }
}
// making interface is similar to class, replace class with "interface"
// interface is automatically abstract
interface AnimalDo{
    public void move();
    public boolean eat(String food);
    // function of an interface is automatically abstract and public
}
// interface can extend interface with new functions
interface MammalDo extends AnimalDo{
    public int legs();
}
// can be nested in multiple interface
interface DogDo extends MammalDo{
    public void barks();
}
interface DomesticAnimalDo{
    public void pet();
}
// class can implement multiple interfaces
// when doing so, both the interfaces' functions must be overriden
class Husky implements DogDo, DomesticAnimalDo{
    @Override
    public void pet(){
        System.out.println("Husky is being pet");
    }
    // when implementing nested interface all function on top of interface needs to be overriden
    @Override
    public void barks(){
        System.out.println("BOW WOW");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public boolean eat(String food){
        return true;
    }
    @Override
    public void move(){
        System.out.println("Husky moves");
    }
}
//we cannot make object of interface
// interface is implemented in class using "implements"
class Wolf implements AnimalDo{
    // when implementing interface, all the function should be overriden
    @Override
    public void move(){
        System.out.println("Wolf walks fast");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Wolf eat meat");
        return true;
    }
}
class Cow implements AnimalDo{
    @Override
    public void move(){
        System.out.println("Cow walks slow");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Cow eat grass");
        return true;
    }
} 
/* X
Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()

 * Make a class Spotify and implement DigitalMedia and OnlineAsset 
 */

 interface Media{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String nowPlaying();
 }


 interface  DigitalMedia extends Media{
    public double size();
    double remaining(double current);
    
 }