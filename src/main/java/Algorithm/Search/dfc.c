#include <stdio.h>

int edge[1010][1010];
int visited[1010];
int u, v;
int N, M;

int def(int cur) {
    visited[cur] = 1;
    printf("%d ", cur);
    for(int i = 1; i <= N; i++) {
        if (visited[i] != 0 || edge[cur][i] == 0) continue;

        dfs(i);
    }
}