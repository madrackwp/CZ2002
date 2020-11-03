#include "cat.h"
#include "dog.h"
#include "lion.h"
#include "animal.h"
#include "mammal.h"

int main()
{
    Animal *zoo[3];

    cout << "Select the animal to send to Zoo:" << endl;
    cout << "1. Dog \n2. Cat \n3. Lion \n4. Move all animals\n5.Quit" << endl;
    int userChoice;
    cin >> userChoice;

    if (userChoice == 1)
    {
        Dog dog = Dog("Lassie", White, "Andy");
        zoo[0] = &dog;
        dog.move();
        dog.speak();
        dog.eat();
    }
    else if (userChoice == 2)
    {
        Cat cat = Cat("Whiskers", White);
        zoo[0] = &cat;
        cat.move();
        cat.speak();
        cat.eat();
    }
    else if (userChoice == 3)
    {
        Lion lion = Lion("Simba", Brown);
        zoo[0] = &lion;
        lion.move();
        lion.speak();
        lion.eat();
    }
    else if (userChoice == 4)
    {
        Dog dog = Dog("Lassie", White, "Andy");
        Cat cat = Cat("Whiskers", White);
        Lion lion = Lion("Simba", Brown);
        zoo[0] = &dog;
        zoo[1] = &cat;
        zoo[2] = &lion;
        dog.move();
        dog.speak();
        dog.eat();
        cat.move();
        cat.speak();
        cat.eat();
        lion.move();
        lion.speak();
        lion.eat();
    }
    else
    {
        cout << "Bye bye!";
    }

    return 0;
}
