#ifndef VALUE_H
#define	VALUE_H

#include <string>

class Value {
public:
    Value(unsigned long value=0);
    Value(std::string str);
    Value(const Value& orig);
    virtual ~Value();
private:
    int size;
    char *digits;
    int *refcount;

};

#endif