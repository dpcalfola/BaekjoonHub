use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();
    let n = input_line.trim().parse::<usize>().unwrap();

    for i in 1..=n {
        print_asterisk(i);
    }
    for i in (1..n).rev() {
        print_asterisk(i)
    }
}

fn print_asterisk(n: usize) {
    let star_line = "*".repeat(n);
    println!("{}", star_line);
    return;
}