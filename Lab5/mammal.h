#ifndef MAMMAL_H
#define MAMMAL_H

#include "animal.h"

class Mammal : public Animal
{

public:
    Mammal() : Animal() {}
    Mammal(string n, COLOR c) : Animal(n, c) {}

    ~Mammal() {}

    void eat() const
    {
        cout << "Mammal eat " << endl;
    }

    void speak()
    {
        cout << "Noise to override" << endl;
    }

    void move()
    {
        cout << "Mammal moves" << endl;
    }
};

#endif