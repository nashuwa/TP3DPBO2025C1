#pragma once
#include <iostream>
#include <string>

using namespace std;

class OS
{
    private:
    string namaOS;
    string versi;

    public:
    OS()
    {

    }

    OS(string namaOS, string versi)
    {
        this->namaOS = namaOS;
        this->versi = versi;
    }

    void setnamaOS(string namaOS)
    {
        this->namaOS = namaOS;
    }

    void setversi(string versi)
    {
        this->versi = versi;
    }

    string getnamaOS()
    {
        return this->namaOS;
    }

    string getversi()
    {
        return this->versi;
    }

    ~OS()
    {

    }
};
