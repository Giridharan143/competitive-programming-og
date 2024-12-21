#include<iostream>
#include<vector>

using namespace std;

int main() {
    vector<string> arr = {"Giri", "Dharan"};
    string final = "";

    // Loop through each string in the vector and reverse it
    for (int i = 0; i < arr.size(); i++) {
        string temp = arr[i];  // Get the current string
        for (int j = temp.size() - 1; j >= 0; j--) {  // Reverse the string
            final += temp[j];
        }
    }

    cout << "The Reversed String is: " << final << endl;
    return 0;
}
