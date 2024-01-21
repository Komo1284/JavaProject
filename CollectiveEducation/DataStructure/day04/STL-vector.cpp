#include <iostream>
#include <vector>
using namespace std;

template <typename T>
ostream& operator << (ostream& os, vector<T> & v){
    os << "<";
    for(int i = 0; i < (int)v,size(); i++)
        os << v[i] << " ";
    os << ">";
    return os;
}

int main()
{
    
    vector<int> vec(10);
    for(int i = 0; i < (int)vec.size(); i++)
        vec[i] = rand() % 100;
    
    cout << "Before: " << vec << endl;

    // 짝수 항목을 제거하는 코드. 반복자를 사용해야 함.
    // for (vector<int)::iterator it = vec.begin(); it != vec.end(); ) {
    for (auto it = vec.begin(); it != vec.end(); ){
        if(*it % 2 == 0)
            it = vec.erase(it);
        else ++it;
    }

    cout << "After : " << vec << endl;
    return 0;
}