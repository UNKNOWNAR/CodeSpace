#pragma once
#include <cstdio>
#include <iostream>

struct UnbufferStdout {
    UnbufferStdout() {
        std::setvbuf(stdout, NULL, _IONBF, 0);
        std::setvbuf(stderr, NULL, _IONBF, 0);
        std::cout << std::unitbuf;
        std::cerr << std::unitbuf;
    }
};

static UnbufferStdout __unbuffer_stdout;
