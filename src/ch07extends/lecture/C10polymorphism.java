package ch07extends.lecture;

public class C10polymorphism {
    Malamute dog1 = new Malamute();
    Chihuahua dog2 = new Chihuahua();

    Canidae can1 = dog1;
    Canidae cna2 = dog2;

    Animal ani1 = dog1;
    Animal ani2 = dog2;
}

class Animal {

}

class Canidae extends  Animal {

}

class Malamute extends Canidae {

}

class Chihuahua extends  Canidae {

}