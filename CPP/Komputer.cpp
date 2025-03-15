#pragma once
#include <iostream>
#include <string>
#include <vector>
#include "Cpu.cpp"
#include "Harddrive.cpp"
#include "Motherboard.cpp"
#include "Gpu.cpp"
#include "OS.cpp"
#include "Casing.cpp"

using namespace std;

class Komputer
{
    private:
    string nama;
    Cpu cpu;
    Harddrive harddrive;
    Motherboard motherboard;
    Gpu gpu;
    OS os;
    Casing casing;

    public:
    Komputer()
    {

    }

    Komputer(string nama, Cpu cpu, Harddrive harddrive, Motherboard motherboard, Gpu gpu, OS os, Casing casing)
    {
        this->nama = nama;
        this->cpu = cpu;
        this->harddrive = harddrive;
        this->motherboard = motherboard;
        this->gpu = gpu;
        this->os = os;
        this->casing = casing;
    }

    void setNama(string nama)
    {
        this->nama = nama;
    }

    void setCpu(Cpu cpu)
    {
        this->cpu = cpu;
    }    

    void setHarddrive(Harddrive harddrive)
    {
        this->harddrive = harddrive;
    }

    void setMotherboard(Motherboard motherboard)
    {
        this->motherboard = motherboard;
    }

    void setGpu(Gpu gpu)
    {
        this->gpu = gpu;
    }

    void setOS(OS os)
    {
        this->os = os;
    }

    void setCasing(Casing casing)
    {
        this->casing = casing;
    }

    string getNama()
    {
        return this->nama;
    }

    Cpu getCpu()
    {
        return this->cpu;
    }

    Harddrive getHarddrive()
    {
        return this->harddrive;
    }

    Motherboard getMotherboard()
    {
        return this->motherboard;
    }

    Gpu getGpu()
    {
        return this->gpu;
    }

    OS getOS()
    {
        return this->os;
    }

    Casing getCasing()
    {
        return this->casing;
    }

    ~Komputer()
    {

    }
};