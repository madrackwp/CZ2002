#ifndef DOG_H
#define DOG_H

#include <iostream>
#include <string>

using namespace std;

#include "mammal.h"

class Dog : public Mammal
{
private:
    string _owner;

public:
    Dog(string n, COLOR c, string owner) : Mammal(n, c)
    {
        _owner = owner;
    }

    ~Dog() {}

    void speak()
    {
        cout << "Woof" << endl;
    }

    void move()
    {
        cout << "Dog moves" << endl;
    }

    void eat()
    {
        cout << "Dog eats a bone" << endl;
    }
};

#endif