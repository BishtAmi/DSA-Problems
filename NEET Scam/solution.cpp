#include <bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        map<ll, ll> mp;
        for (auto num : arr)
        {
            mp[num]++;
        }
        int ans = 0;
        for (auto num : mp)
        {
            int cur = num.second;
            ans += cur * (cur - 1) / 2;
        }
        cout << ans << '\n';
    }
}