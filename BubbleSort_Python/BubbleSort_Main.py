def swap_items(array, right, left):
    if left > right:
        temp = array[left]
        array[left] = array[right]
        array[right] = temp


def bubble_sort(array_items):