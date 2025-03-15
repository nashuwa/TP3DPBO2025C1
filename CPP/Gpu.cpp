#pragma once
#include <iostream>
#include <string>
#include "Komponen.cpp"

using namespace std;

class Gpu : public Komponen
{
    private:
    int kapasitasVRAMGB;
    float kecepatanCoreMhz;
    string tipeGpu;

    public:
    Gpu()
    {

    }

    Gpu(int kapasitasVRAMGB, float kecepatanCoreMhz, string tipeGpu, string merk, string nama) : Komponen(merk, nama)
    {
        this->kapasitasVRAMGB = kapasitasVRAMGB;
        this->kecepatanCoreMhz = kecepatanCoreMhz;
        this->tipeGpu = tipeGpu;
    }

    void setkapasitasVRAMGB(int kapasitasVRAMGB)
    {
        this->kapasitasVRAMGB = kapasitasVRAMGB;
    }

    void setkecepatanCoreMhz(float kecepatanCoreMhz)
    {
        this->kecepatanCoreMhz = kecepatanCoreMhz;
    }

    void settipeGpu(string tipeGpu)
    {
        this->tipeGpu = tipeGpu;
    }

    int getkapasitasVRAMGB()
    {
        return this->kapasitasVRAMGB;
    }

    float getkecepatanCoreMhz()
    {
        return this->kecepatanCoreMhz;
    }

    string gettipeGpu()
    {
        return this->tipeGpu;
    }

    ~Gpu()
    {

    }
};
