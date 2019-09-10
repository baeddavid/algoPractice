#include <string.h>
using namespace std;

int containsString(char *a, char *b) {
    int aLen, bLen;
    int i, j;
    int counter = 0;

    aLen = strlen(a);
    bLen = strlen(b);

    for(i = 0; i < bLen - aLen; i++) {
        j = 0;
        while(j < aLen && (b[i + j] == a[j]))
            j++;
        if(j == aLen) counter++;
    }
    return counter;
}