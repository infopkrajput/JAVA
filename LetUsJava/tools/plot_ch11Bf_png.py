#!/usr/bin/env python3
# Draw the points and connecting path into a PNG using Pillow.
from PIL import Image, ImageDraw, ImageFont
import math, os

# Points
points = [(2,3),(5,6),(7,2),(3,8),(9,1),(4,4),(6,7),(8,5),(1,9),(0,0)]
# image settings
W = 800
H = 800
margin = 60
grid = 9
cell = (W - 2*margin) / grid

img = Image.new('RGB',(W,H),'white')
d = ImageDraw.Draw(img)

# draw grid
for i in range(grid+1):
    x = margin + i*cell
    d.line([(x,margin),(x,H-margin)], fill=(230,230,230))
    y = margin + i*cell
    d.line([(margin,y),(W-margin,y)], fill=(230,230,230))

# draw axes numbers
font = None
try:
    font = ImageFont.truetype('DejaVuSans.ttf', 14)
except Exception:
    font = ImageFont.load_default()

for i in range(10):
    x = margin + i*cell
    d.text((x, H-margin+8), str(i), fill='black', font=font)
    y = margin + i*cell
    d.text((margin-20, y), str(9-i), fill='black', font=font)

# helper to map coords
def map_pt(pt):
    x,y = pt
    px = margin + x*cell
    py = margin + (9 - y)*cell
    return (px,py)

# compute segments and total
segs = []
for i in range(len(points)-1):
    a = points[i]
    b = points[i+1]
    dx = b[0]-a[0]
    dy = b[1]-a[1]
    segs.append(math.hypot(dx,dy))

total = sum(segs)

# draw polyline
mapped = [map_pt(p) for p in points]
d.line(mapped, fill=(31,119,180), width=3)
# draw points and labels
for i,pt in enumerate(mapped):
    d.ellipse((pt[0]-6,pt[1]-6,pt[0]+6,pt[1]+6), fill=(255,127,14), outline=(211,84,0))
    txt = f"{i}:{points[i]}"
    d.text((pt[0]+8, pt[1]-10), txt, fill='black', font=font)

# annotate segment distances at midpoint
for i in range(len(mapped)-1):
    ax,ay = mapped[i]
    bx,by = mapped[i+1]
    mx,my = (ax+bx)/2, (ay+by)/2
    d.text((mx-20,my-10), f"{segs[i]:.2f}", fill=(179,0,0), font=font)

# total text
d.text((margin, H-30), f"Total length ≈ {total:.6f}", fill='black', font=font)

outdir = os.path.join(os.path.dirname(__file__), '..', 'out')
if not os.path.isdir(outdir):
    os.makedirs(outdir)
outfile = os.path.join(outdir, 'ch11_points.png')
img.save(outfile)
print('Saved PNG to', outfile)
print('Total length:', total)
