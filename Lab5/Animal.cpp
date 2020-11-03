// #include <iostream>
// #include <string>

// using namespace std;

// enum COLOR
// {
//     Green,
//     Blue,
//     White,
//     Black,
//     Brown
// };

// class Animal
// {
//     private:
//         string _name;
//         COLOR _color;

//     public:
//         Animal() : _name("unknown")
//         {
//             cout << "constructing Animal object " << _name << endl;
//         }

//         Animal(string n, COLOR c){
//             _name = n;
//             _color = c;
//             cout << "Color of animal is " << COLOR(c) << c << endl;
//             cout << "Name of animal is " << _name << endl;
//         }

//         ~Animal()
//         {
//             cout << "destructing Animal object " << _name << endl;
//         }

//         virtual void speak()
//         {
//             cout << "speak() to overide in Animal " << endl;
//         }

//         virtual void move() const{}

//         virtual void move()=0; // This is a pure method which makes the Animal class an abstract class
// };

// class Mammal: public Animal{

//     public:
//     Mammal():Animal(){}
//     Mammal(string n, COLOR c):Animal(n,c){}

//     ~Mammal(){}

//     void eat() const{
//         cout << "Mammal eat " << endl;
//     }

//     void speak(){
//         cout << "Noise to override" << endl;
//     }

//     void move(){
//         cout << "Mammal moves" << endl;
//     }

// };

// class Dog: public Mammal{
//     private:
//         string _owner;

//     public:
//         Dog(string n, COLOR c, string owner):Mammal(n,c){
//             _owner = owner;
//         }
        
//         ~Dog(){}

//         void speak(){
//             cout<<"Woof"<<endl;
//         }

//         void move(){
//             cout<<"Dog moves"<<endl;
//         }
// };

// class Cat: public Mammal{
//     public:
//         Cat(): Mammal(){}
//         Cat(string s, COLOR c): Mammal(s, c){}
//         ~Cat(){cout << "Cat object destroyed" << endl;}
//         void speak(){
//             cout<<"Cat goes meow"<< endl;
//         }

// };

// class Lion: public Mammal{
//     public:
//         Lion(): Mammal(){}
//         Lion(string s, COLOR c):Mammal(s,c){}
//         ~Lion(){cout << "Lion object destroyed" << endl;}
//         void speak(){
//             cout<<"Lion goes roar"<<endl;
//         }
// };

// int main()
// {
//     // Animal a("dog", Black);
//     // a.speak();
//     // cout << "Program exiting ... " << endl;


//     // Mammal mammal("mammal", Brown);
//     // mammal.speak();

//     // Dog dog("Snowy", White, "Peter");
//     // Mammal *mammalPtr = &dog;
//     // Mammal &mammalRef = dog;
//     // Mammal mammalVal = dog;

//     // mammalPtr -> speak();
//     // mammalRef.speak();
//     // mammalVal.speak();

//     // dog.move();
//     // mammalPtr -> move();
//     // mammalRef.move();
//     // mammalVal.move();

//     // Animal *animalPtr = new Dog("Lassie", White, "Andy");
//     // animalPtr->move();
//     // animalPtr->speak();

//     // Dog dogi("Lassie", White, "Andy");
//     // Mammal *aniptr = &dogi;
//     // Mammal &aniRef = dogi;
//     // Mammal aniVal = dogi;

//     // aniptr->speak();
//     // aniRef.speak();
//     // aniVal.speak();
//     // delete animalPtr;
//     Animal* zoo[3];

//     cout << "Select the animal to send to Zoo:" << endl;
//     cout << "1. Dog \n2. Cat \n3. Lion \n4. Move all animals\n5.Quit"<<endl;
//     int userChoice;
//     cin >> userChoice;

//     if (userChoice == 1){
//         Dog dog = Dog("Lassie", White, "Andy");
//         zoo[0] = &dog;
//         dog.move();
//         dog.speak();
//         dog.eat();
//     } else if (userChoice == 2){
//         Cat cat = Cat("Whiskers", White);
//         zoo[0] = &cat;
//         cat.move();
//         cat.speak();
//         cat.eat();
//     } else if (userChoice == 3){
//         Lion lion = Lion("Simba", Brown);
//         zoo[0] = &lion;
//         lion.move();
//         lion.speak();
//         lion.eat();
//     } else if (userChoice == 4){
//         Dog dog = Dog("Lassie", White, "Andy");
//         Cat cat = Cat("Whiskers", White);
//         Lion lion = Lion("Simba", Brown);
//         zoo[0] = &dog;
//         zoo[1] = &cat;
//         zoo[2] = &lion;
//         dog.move(); dog.speak(); dog.eat();
//         cat.move(); cat.speak(); cat.eat();
//         lion.move(); lion.speak(); lion.eat();
//     } else {
//         cout << "Bye bye!";
//     }

//     return 0;
// }
