#include "Include/bst.h"

int main(int argc, char const *argv[])
{
    /*
          3
         / \
        1   6
       / \   \
      0   2   10    
    */

    tree_t* tree = create_tree();
    insert(tree, 3);
    insert(tree, 6);
    insert(tree, 1);
    insert(tree, 0);
    insert(tree, 2);
    insert(tree, 10);
    
    pre_order(tree);
    
    int tree_height = height(tree);

    printf("Tree height: %d\n", tree_height);

    node_t largest = *remove_largest(tree);
    
    node_t smallest = *remove_smallest(tree);

    pre_order(tree);

    return 0;
}