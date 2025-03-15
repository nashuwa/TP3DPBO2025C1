#pragma once
#include <iostream>
#include <string>
#include "Komponen.cpp"

using namespace std;

class Casing : public Komponen
{
    private:
    string tipeCasing;
    int jumlahFan;

    public:
    Casing()
    {

    }

    Casing(string tipeCasing, int jumlahFan, string merk, string nama) : Komponen(merk, nama)
    {
        this->tipeCasing = tipeCasing;
        this->jumlahFan = jumlahFan;
    }

    void settipeCasing(string tipeCasing)
    {
        this->tipeCasing = tipeCasing;
    }

    void setjumlahFan(int jumlahFan)
    {
        this->jumlahFan = jumlahFan;
    }

    string gettipeCasing()
    {
        return this->tipeCasing;
    }

    int getjumlahFan()
    {
        return this->jumlahFan;
    }

    ~Casing()
    {

    }
};
