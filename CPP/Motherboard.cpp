#pragma once
#include <iostream>
#include <string>
#include <vector>
#include "Ram.cpp"
#include "Komponen.cpp"

using namespace std;

class Motherboard : public Komponen
{
    private:
    string chipset;
    string socketCpu;
    vector<Ram> ramList;

    public:
    Motherboard()
    {

    }

    Motherboard(string chipset, string socketCpu, vector<Ram> ramList, string merk, string nama) : Komponen(merk, nama)
    {
        this->chipset = chipset;
        this->socketCpu = socketCpu;
        this->ramList = ramList;
    }

    void setchipset(string chipset)
    {
        this->chipset = chipset;
    }

    void setsocketCpu(string socketCpu)
    {
        this->socketCpu = socketCpu;
    }

    void setRamList(vector<Ram> ramList)
    {
        this->ramList = ramList;
    }  

    string getchipset()
    {
        return this->chipset;
    }

    string getsocketCpu()
    {
        return this->socketCpu;
    }

    vector<Ram> getRamList()
    {
        return this->ramList;
    }

    void addRam(Ram ram)
    {
        this->ramList.push_back(ram);
    }
    

    ~Motherboard()
    {

    }
};
