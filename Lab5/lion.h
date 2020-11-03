#ifndef LION_H
#define LION_H

#include <iostream>
#include <string>

using namespace std;

#include "mammal.h"

class Lion : public Mammal
{
public:
    Lion() : Mammal() {}
    Lion(string s, COLOR c) : Mammal(s, c) {}
    ~Lion() { cout << "Lion object destroyed" << endl; }
    void speak()
    {
        cout << "Lion goes roar" << endl;
    }
};

#endif