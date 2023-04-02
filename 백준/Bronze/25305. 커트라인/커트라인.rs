use std::io::stdin;

fn main() {
    let nk = read_int_vector();
    let mut scores = read_int_vector();

    // Sort reversely
    scores.sort_unstable_by_key(|x| -x);
    
    // Get "k"th index
    let k_index = nk[1].to_string().parse::<usize>().unwrap() - 1;

    println!("{}", scores[k_index]);
}

fn read_int_vector() -> Vec<i32> {
    let mut input_line = String::new();
    stdin().read_line(&mut input_line).unwrap();

    let out_vec: Vec<i32> = input_line
        .trim()
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect();

    return out_vec;
}