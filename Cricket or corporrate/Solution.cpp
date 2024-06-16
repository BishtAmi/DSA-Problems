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
        string s;
        cin >> s;
        unordered_map<char, vector<int>> mp;
        for (int i = 0; i < n; i++)
        {
            mp[s[i]].push_back(i + 1);
        }
        ll ans = 0;
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            int sz = mp[ch].size() - 1, cnt = 0;
            for (auto x : mp[ch])
            {
                ans += ((ll)cnt * x - (ll)sz * x);
                cnt++;
                sz--;
            }
        }
        cout << ans << "\n";
    }
}

