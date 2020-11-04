#ifndef CAT_H
#define CAT_H

#include <iostream>
#include <string>

using namespace std;

#include "mammal.h"

class Cat : public Mammal
{
public:
    Cat() : Mammal() {}
    Cat(string s, COLOR c) : Mammal(s, c) {}
    ~Cat() { cout << "Cat object destroyed" << endl; }
    void speak()
    {
        cout << "Cat goes meow" << endl;
    }
    void move()
    {
        cout << "Cat moves" << endl;
    }

    void eat()
    {
        cout << "Cat eats a fish" << endl;
    }
};

#endif