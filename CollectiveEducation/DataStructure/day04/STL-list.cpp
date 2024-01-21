#include <iostream>
#include <list>
using namespace std;

template <typename T>
void printContainer(T& v, string msg = "container"){
    cout << msg << "<";
    //for (T::iterator it = v.begin(); it != v.end(); ++it)
    for (auto it = v.begin(); it != v.end(); ++it)
            cout << *it << " ";
    cout << ">\n";
}
int main(){
    list<int> sortList;
    for(int i = 0; i < 10; i++){
        int val = rand() % 100;
        auto curr = sortList.begin();
        for(; curr != sortList.end(); ++curr)
            if (val >= *curr) break;
        sortList.insert(curr, val);
    }
    printContainer(sortList, "Sorted List: ");
    return 0;
}