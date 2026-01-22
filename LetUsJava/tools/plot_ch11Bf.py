#!/usr/bin/env python3
# Plot the sequence of points from ch11Bf.java and draw connecting lines.
# Saves an image to /home/pknatic/Desktop/code/JAVA/LetUsJava/out/ch11_points.png and prints segment distances and total length.

import math
import os
import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt

# Points from ch11Bf.java
x = [2, 5, 7, 3, 9, 4, 6, 8, 1, 0]
y = [3, 6, 2, 8, 1, 4, 7, 5, 9, 0]

# Compute distances
segments = []
for i in range(len(x)-1):
    dx = x[i+1] - x[i]
    dy = y[i+1] - y[i]
    d = math.hypot(dx, dy)
    segments.append(d)

total = sum(segments)

# Create plot
fig, ax = plt.subplots(figsize=(8,8))
ax.plot(x, y, '-o', color='tab:blue', linewidth=2, markersize=6)

# Annotate points with their index and coordinates
for i,(xi,yi) in enumerate(zip(x,y)):
    ax.text(xi + 0.1, yi + 0.1, f'{i}:({xi},{yi})', fontsize=9)

# Annotate mid-segment distances
for i in range(len(x)-1):
    mx = (x[i] + x[i+1]) / 2.0
    my = (y[i] + y[i+1]) / 2.0
    ax.text(mx, my, f'{segments[i]:.2f}', color='red', fontsize=8, ha='center', va='center')

ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_title(f'Path connecting points — total length = {total:.4f}')
ax.grid(True)
ax.set_aspect('equal', adjustable='box')

outfile = '/home/pknatic/Desktop/code/JAVA/LetUsJava/out/ch11_points.png'
os.makedirs(os.path.dirname(outfile), exist_ok=True)
plt.savefig(outfile, bbox_inches='tight', dpi=150)
print('Saved image to', outfile)
print('Segment distances:')
for i,d in enumerate(segments):
    print(f'  {i} -> {i+1}: {d:.6f}')
print('Total distance:', f'{total:.6f}')
