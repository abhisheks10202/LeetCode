# Minimum Cost to cut a board into squares
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">A board of length <strong>M</strong>&nbsp;and width <strong>N</strong>&nbsp;is given.&nbsp;The task is&nbsp;to break this board into <strong>M * N</strong>&nbsp;squares such that cost of breaking is minimum. The cutting cost for each edge will be given for the board in two arrays <strong>X[]</strong>&nbsp;and <strong>Y[]</strong>. In short, you&nbsp;need to choose such a sequence of cutting such that cost is minimized. Return the minimized cost.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="position: relative;"><span style="font-size:18px"><strong>Input:
M = 6. N = 4</strong>
X[] = {2, 1, 3, 1, 4}
Y[] = {4, 1, 2}
<strong>Output: </strong>42
<strong>Explanation:</strong> 
<img alt="" src="https://media.geeksforgeeks.org/img-practice/board-1646284249.png" style="height:200px; width:300px" class="img-responsive">
For above board optimal way to cut into square is:
Total minimum cost in above case is 42. It is 
evaluated using following steps.
Initial Value : Total_cost = 0
Total_cost = Total_cost + edge_cost * total_pieces
Cost 4 Horizontal cut:      Cost = 0 + 4*1 = 4
Cost 4 Vertical cut:        Cost = 4 + 4*2 = 12
Cost 3 Vertical cut:        Cost = 12 + 3*2 = 18
Cost 2 Horizontal cut:      Cost = 18 + 2*3 = 24
Cost 2 Vertical cut:        Cost = 24 + 2*3 = 30
Cost 1 Horizontal cut:      Cost = 30 + 1*4 = 34
Cost 1 Vertical cut:        Cost = 34 + 1*4 = 38
Cost 1 Vertical cut:        Cost = 38 + 1*4 = 42
</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minimumCostOfBreaking</strong><strong>()</strong>&nbsp;which takes a&nbsp;string S&nbsp;and returns an integer as output.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(NlogN + MlogM)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
2 &lt;= N, M&nbsp;&lt;= 10<sup>5</sup></span></p>
 <p></p>
            </div>