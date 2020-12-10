#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>

typedef struct node_t node_t; 
typedef struct tree_t tree_t; 

struct node_t {
    int data;
    struct node_t* left;
    struct node_t* right;
};

struct tree_t {
    struct node_t* root;
};

tree_t* create_tree();

void insert(tree_t* tree, int data);

node_t* remove(tree_t* tree, int data);

node_t* remove_largest(tree_t* tree);

node_t* remove_smallest(tree_t* tree);

int height(tree_t* tree);

void pre_order(tree_t* tree);

void post_order(tree_t* tree);

void in_order(tree_t* tree);

bool is_empty(tree_t* tree);

