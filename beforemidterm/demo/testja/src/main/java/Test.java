import Model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

//@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
    public  ArrayList<Car> listCar = new ArrayList<Car>();

//    @RequestMapping("/")
//    String Home(){
//        return "Home<button>TEST</button>";
//    }

//    @RequestMapping("/method")
//    String Cart(){
//        return "Cart<button>TEST</button>";
//    }
//
//    @RequestMapping(value = "/get/{firstname}/{lastname}",method = RequestMethod.POST)
//    public String Hello(@PathVariable("firstname") String firstName,@PathVariable("lastname") String lastName){
//        return String.format("{\"message\":\"Hello %s %s\"}", firstName,lastName);
//
//    }
//
//    @RequestMapping(value = "/",method = RequestMethod.POST)
//    public String Hello2(@RequestBody Object object){
//        System.out.print(object);
//        return String.format("{\"message\":\"Hello %s\"}", object);
//
//    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<ArrayList<Car>> CreateCar(@RequestBody Car[] car){
        for (Car cars: car
             ) {
            Car newCar = new Car(cars);
            boolean chk = false;
            for (Car oldCar: listCar
                 ) {
                if(oldCar.id == cars.id) {
                    oldCar.setSunroof(cars.getSunroof());
                    oldCar.setSpeed(cars.getSpeed());
                    oldCar.setDisplacement(cars.getDisplacement());
                    oldCar.setColor(cars.getColor());
                    chk = true;
                }
            }
            if (chk == false) {
                listCar.add(newCar);
            }
        }

        return new ResponseEntity<ArrayList<Car>>(listCar, HttpStatus.OK);

    }

    @RequestMapping(value = "/cars",method = RequestMethod.GET)
    public List<Car> getCar(){
        return listCar;

    }

    @RequestMapping(value = "/read/{id}",method = RequestMethod.GET)
    public Car getCar(@PathVariable int id){
        for (Car car:listCar) {
            if (car.id == id) return car;
        }
        return null;
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public Car updateCar(@PathVariable int id, @RequestBody Car newCar){
        for (Car car:listCar) {
            if (car.id == id) {
                car.setColor(newCar.getColor());
                car.setDisplacement(newCar.getDisplacement());
                car.setSpeed(newCar.getSpeed());
                car.setSunroof(newCar.getSunroof());
                return car;
            }
        }
        return null;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public ArrayList<Car> DeleteCar(@PathVariable int id){
        ArrayList<Car> newArray = new ArrayList<Car>();
        for (Car car:listCar) {
            if (car.id != id) {
                newArray.add(car);
            }
        }
        listCar = newArray;
        return listCar;
    }


}
