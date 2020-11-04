#ifndef ANIMAL_H
#define ANIMAL_H

#include <iostream>
#include <string>

using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
private:
    string _name;
    COLOR _color;

public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }

    Animal(string n, COLOR c)
    {
        _name = n;
        _color = c;
        // cout << "Color of animal is " << COLOR(c) << c << endl;
        cout << "Name of animal is " << _name << endl;
        switch (c)
        {
        case Green:
            cout << "Color of animal is Green" << endl;
            break;
        case Blue:
            cout << "Color of animal is Blue" << endl;
            break;
        case White:
            cout << "Color of animal is White" << endl;
            break;
        case Black:
            cout << "Color of animal is Black" << endl;
            break;
        case Brown:
            cout << "Color of animal is Brown" << endl;
            break;
        }
        }

    ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }

    virtual void speak()
    {
        cout << "speak() to overide in Animal " << endl;
    }

    virtual void move() const {}

    virtual void move() = 0; // This is a pure method which makes the Animal class an abstract class
};

#endif